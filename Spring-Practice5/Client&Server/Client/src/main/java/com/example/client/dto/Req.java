package com.example.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Req<T> {
    private Header header;
    private T resBody;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Header{
        private String responseCode;
    }
}
