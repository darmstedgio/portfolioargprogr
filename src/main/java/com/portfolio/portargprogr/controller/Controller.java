package com.portfolio.portargprogr.controller;

import java.time.Instant;

import com.portfolio.portargprogr.model.*;
import com.portfolio.portargprogr.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private ITecnologyService tecnServ;
    @Autowired
    private IProjectService projServ;
    @Autowired
    private IStudyService studServ;
    @Autowired
    private ILaboralExperienceService labexpServ;
    @Autowired
    private IAboutMeService aboutmeServ;


    /* ********** Tecnology ********** */
    @GetMapping("/api/index/tecnologies")
    @ResponseBody
    public List<Tecnology> listTecnology(){
        return tecnServ.listTecnology();
    }
    // Store
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/api/store/tecnology")
    public void storeTecnology(@RequestBody Tecnology tec){
        tecnServ.storeTecnology(tec);
    }
    // Update
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/api/update/tecnology")
    public Tecnology updateTecnology(@RequestBody Tecnology tec){
        tecnServ.storeTecnology(tec);
        return tec;
    }
    // Find
    @GetMapping("/api/find/tecnology/{id}")
    @ResponseBody
    public Tecnology findTecnology(@PathVariable Long id){
        return tecnServ.findTecnology(id);
    }
    // Delete
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/api/delete/tecnology/{id}")
    public void deleteTecnology(@PathVariable Long id){
        tecnServ.deleteTecnology(id);
    }
    /* ********** End Tecnology ********** */



    /* ********** Project ********** */
    @GetMapping("/api/index/projects")
    @ResponseBody
    public List<Project> listProject(){
        return projServ.listProject();
    }
    // Store
    @PostMapping("/api/store/project")
    @PreAuthorize("hasRole('ADMIN')")
    public void storeProject(@RequestBody Project proje){
        projServ.storeProject(proje);
    }
    // Update
    @PutMapping("/api/update/project")
    @PreAuthorize("hasRole('ADMIN')")
    public Project updateProject(@RequestBody Project proje){
        projServ.storeProject(proje);
        return proje;
    }
    // Find
    @GetMapping("/api/find/project/{id}")
    @ResponseBody
    public Project findProject(@PathVariable Long id){
        return projServ.findProject(id);
    }
    // Delete
    @DeleteMapping("/api/delete/project/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteProject(@PathVariable Long id){
        projServ.deleteProject(id);
    }
    /* ********** End Project ********** */



    /* ********** Study ********** */
    @GetMapping("/api/index/studies")
    @ResponseBody
    public List<Study> listStudy(){
        return studServ.listStudy();
    }
    // Store
    @PostMapping("/api/store/study")
    @PreAuthorize("hasRole('ADMIN')")
    public void storeStudy(@RequestBody Study stu){
        studServ.storeStudy(stu);
    }
    // Update
    @PutMapping("/api/update/study")
    @PreAuthorize("hasRole('ADMIN')")
    public Study updateStudy(@RequestBody Study stu){
        studServ.storeStudy(stu);
        return stu;
    }
    // Find
    @GetMapping("/api/find/study/{id}")
    @ResponseBody
    public Study findStudy(@PathVariable Long id){
        return studServ.findStudy(id);
    }
    // Delete
    @DeleteMapping("/api/delete/study/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteStudy(@PathVariable Long id){
        studServ.deleteStudy(id);
    }
    /* ********** End Study ********** */



    /* ********** LaboralExperience ********** */
    @GetMapping("/api/index/laboralexperiences")
    @ResponseBody
    public List<LaboralExperience> listLaboralExperience(){
        return labexpServ.listLaboralExperience();
    }
    // Store
    @PostMapping("/api/store/laboralexperience")
    @PreAuthorize("hasRole('ADMIN')")
    public void storeLaboralExperience(@RequestBody LaboralExperience labex){
        labexpServ.storeLaboralExperience(labex);
    }
    // Update
    @PutMapping("/api/update/laboralexperience")
    @PreAuthorize("hasRole('ADMIN')")
    public LaboralExperience updateLaboralExperience(@RequestBody LaboralExperience labex){
        labexpServ.storeLaboralExperience(labex);
        return labex;
    }
    // Find
    @GetMapping("/api/find/laboralexperience/{id}")
    @ResponseBody
    public LaboralExperience findLaboralExperience(@PathVariable Long id){
        return labexpServ.findLaboralExperience(id);
    }
    // Delete
    @DeleteMapping("/api/delete/laboralexperience/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteLaboralExperience(@PathVariable Long id){
        labexpServ.deleteLaboralExperience(id);
    }
    /* ********** End LaboralExperience ********** */


    /* ********** AboutMe ********** */
    @GetMapping("/api/index/aboutme")
    @ResponseBody
    public List<AboutMe> listAboutMe(){
        return aboutmeServ.listAboutMe();
    }
    // Store
    @PostMapping("/api/store/aboutme")
    @PreAuthorize("hasRole('ADMIN')")
    public void storeAboutMe(@RequestBody AboutMe labex){
        aboutmeServ.storeAboutMe(labex);
    }
    // Update
    @PutMapping("/api/update/aboutme")
    @PreAuthorize("hasRole('ADMIN')")
    public AboutMe updateAboutMe(@RequestBody AboutMe labex){
        aboutmeServ.storeAboutMe(labex);
        return labex;
    }
    // Find
    @GetMapping("/api/find/aboutme/{id}")
    @ResponseBody
    public AboutMe findAboutMe(@PathVariable Long id){
        return aboutmeServ.findAboutMe(id);
    }
    // Delete
    @DeleteMapping("/api/delete/aboutme/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteAboutMe(@PathVariable Long id){
        aboutmeServ.deleteAboutMe(id);
    }
    /* ********** End AboutMe ********** */


   // Test api heroku
   @GetMapping("/api/time")
   @ResponseStatus(HttpStatus.OK)
   public String getCurrentTime() {

       return Instant.now().toString();
   }
   
}

