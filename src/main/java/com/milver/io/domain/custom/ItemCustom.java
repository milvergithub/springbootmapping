package com.milver.io.domain.custom;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemCustom implements Serializable {

    private Integer itmId;

    private String itmName;

    private String itmDescription;

    private Boolean itmActive;

    public ItemCustom(Integer itmId, String itmName, String itmDescription) {
        this.itmId = itmId;
        this.itmName = itmName;
        this.itmDescription = itmDescription;
    }
}
