package com.example.chatgptbot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
   private String role; //either user or admin
   private String content; //prompt/ question to ask chatgpt

}
