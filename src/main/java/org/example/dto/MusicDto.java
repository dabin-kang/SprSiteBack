package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MusicDto {
    private String id;
    private String title;
    private String artist;
    // 마스코트 캐릭터를 활용한 커스텀 필드 추가 가능
}