package com.mlj.snapup.commonapi.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author menglinjie
 * @date Created in 2020/4/15 14:19
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {
    private String data;
}