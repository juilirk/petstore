package com.itvedant.petstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.itvedant.petstore.services.FileService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FileController {

    //During the upload operation,
    //request will come along with the file that has to be uploaded
    //so in the parameter of this function we have to read the file
    //in the variable using @RequestParam
    //During the upload operation,
    //request will come along with the file that has to be uploaded
    //so in the parameter of this function we have to read the file
    //in the variable using @RequestParam

    @Autowired
    private FileService service;

    @PostMapping("/products/{id}/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file,
                                        @PathVariable Integer id){
        return ResponseEntity.ok(this.service.fileUpload(file, id));
    }

    @GetMapping("/products/download/{fileName}")
    public ResponseEntity<?> downloadFile(@PathVariable String fileName){
        Resource resource = this.service.fileDownload(fileName);

        return ResponseEntity.ok()
                             .header(HttpHeaders.CONTENT_DISPOSITION,
                                "attachment; filename=\"" + fileName + "\"")
                             .body(resource);
    }
}
