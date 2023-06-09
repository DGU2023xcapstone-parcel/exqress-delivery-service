package com.example.deliveryservice.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {

    @Schema(description = "반환 데이터 개수", nullable = false, example = "4")
    private int count;
    private T data;

}
