package com.jasper.guavaDemo.eventBus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-19
 */
@Data
public class SimpleEvent {
    private final String message;
}
