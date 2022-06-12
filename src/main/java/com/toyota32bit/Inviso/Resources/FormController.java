package com.toyota32bit.Inviso.Resources;

import com.toyota32bit.Inviso.Entities.Application;
import com.toyota32bit.Inviso.Services.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class FormController {

    private final ApplicationService applicationService;

    @RequestMapping(value = {"/saveForm"},method = RequestMethod.POST, consumes = {"application/json"})
    public String saveForm(@RequestBody String rawJson){
        JSONObject allJson = new JSONObject(rawJson);
        JSONObject appJson = allJson.getJSONObject("data");
        JSONObject version = appJson.getJSONObject("version");
        JSONArray pages = appJson.getJSONArray("pages");

        Application app = new Application(
                appJson.getLong("id"),
                LocalDate.now().toString(),
                allJson.getString("userName"),
                appJson.getString("description"),
                appJson.getString("name"),
                appJson.getString("shortName"),
                appJson.get("updatedAt").toString(),
                "",
                version.get("id").toString(),
                appJson.get("logo").toString(),
                appJson.getInt("formType"));

        applicationService.saveApplication(app);
        return "Application saved";
    }
}
