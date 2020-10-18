package com.aroussi.retryabledbconnection.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * This is a Decorator that add the retry capabilities to a {@link DataSource datasource}
 * @author aroussi
 * @version %I% %G%
 */
@Slf4j
@RequiredArgsConstructor
public class RetryableDataSource extends AbstractDataSource {

    private final DataSource dataSource;

    @Override
    @Retryable(maxAttempts = 5, backoff = @Backoff(multiplier = 1.3, maxDelay = 10000))
    public Connection getConnection() throws SQLException {
        log.info("getting connection ...");
        return dataSource.getConnection();
    }

    @Override
    @Retryable(maxAttempts = 5, backoff = @Backoff(multiplier = 1.3, maxDelay = 10000))
    public Connection getConnection(String username, String password) throws SQLException {
        log.info("getting connection by username and password ...");
        return dataSource.getConnection(username, password);
    }
}
