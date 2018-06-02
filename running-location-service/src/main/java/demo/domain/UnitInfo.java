package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Embeddable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
public class UnitInfo {

    private final String runningId;
    private String bandMaker;
    private String customerName;
    private String unitNumber;

    public UnitInfo(){
        this.runningId="";
    }

    public UnitInfo(String runningId){
        this.runningId = runningId;
    }

    public UnitInfo(String runningId, String bandMaker, String customerName, String unitNumber){
        this.runningId=runningId;
        this.bandMaker=bandMaker;
        this.customerName = customerName;
        this.unitNumber = unitNumber;
    }
}
