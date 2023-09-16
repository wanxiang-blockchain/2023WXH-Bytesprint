package com.bytesprint.domain.project.model;

import java.time.LocalDateTime;

/**
 * TimeRange
 *
 * @author Eason Liu
 * Create at: 2023/9/15
 */
public record TimeRange(LocalDateTime startTime, LocalDateTime endTime) {
}
