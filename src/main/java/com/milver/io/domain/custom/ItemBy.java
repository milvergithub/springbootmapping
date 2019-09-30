package com.milver.io.domain.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemBy implements Serializable {

    private Integer itmId;

    private String itmName;

    private String itmDescription;
}
