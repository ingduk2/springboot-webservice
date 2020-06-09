package com.ingduk2.boot.springboot.dto;

import com.ingduk2.boot.springboot.web.dto.HelloResponseDto;
import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lomboktest(){
        //givven
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name , amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
