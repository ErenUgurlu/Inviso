package com.toyota32bit.Inviso.Resources;

import com.toyota32bit.Inviso.Services.HomePageService;
import com.toyota32bit.Inviso.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class HomeController {
    private final HomePageService homePageService;
    @GetMapping("/home")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Merhaba");
    }
    @GetMapping("/home/numberOfUsers")
    public ResponseEntity<Integer> getNumberOfUsers(){
        return ResponseEntity.ok(homePageService.getNumberOfUsers());
    }
    @GetMapping("/home/numberOfRoles")
    public ResponseEntity<Integer> getNumberOfRoles(){
        return ResponseEntity.ok(homePageService.getNumberOfRoles());
    }
}
