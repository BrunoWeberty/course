package com.ead.course.services;

import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface UtilService {
    String createUrl(UUID courseId, Pageable pageable);
}