package com.aroussi.retryabledbconnection.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

/**
 * @author aroussi
 * @version %I% %G%
 */
@Getter
@Builder
public class Post {
    private String id;
    private String title;
    private String content;
    private String author;
    private LocalDate publishedOn;
}
