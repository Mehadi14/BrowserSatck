package BrowserSatckApis.DemoApis.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class dataModel {

    private String accesskey;
    private String username;
    private String sessionID;
}
