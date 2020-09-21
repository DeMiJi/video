package com.cap.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    private int Video_ID;
    private String Video_Name;
    private String Video_Info;
    private String Video_UpOfUser;
    private Date Video_UpTime;
    private String Video_Type;
    private int PlaySum;
    private int ComentSum;
    private int CollectSum;
    private int SupportSum;
    private int CoinSum;
}
