package com.banquito.client.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientAddress {

    private String codeLocation;
    private String addressLineOne;
    private String addressLineTwo;
    private String latitude;
    private String longitude;
}
