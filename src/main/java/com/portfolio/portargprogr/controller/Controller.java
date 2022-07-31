package com.portfolio.portargprogr.controller;

import java.time.Instant;

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

import com.portfolio.portargprogr.model.Identity;
import com.portfolio.portargprogr.model.User;
import com.portfolio.portargprogr.model.Tecnology;
import com.portfolio.portargprogr.model.Project;
import com.portfolio.portargprogr.model.Study;
import com.portfolio.portargprogr.model.LaboralExperience;
import com.portfolio.portargprogr.service.IIdentityService;
import com.portfolio.portargprogr.service.ILaboralExperienceService;
import com.portfolio.portargprogr.service.IProjectService;
import com.portfolio.portargprogr.service.IStudyService;
import com.portfolio.portargprogr.service.ITecnologyService;
import com.portfolio.portargprogr.service.IUserService;

import java.util.List;

@RestController
public class Controller {




    @Autowired
    private IIdentityService idenServ;
    @Autowired
    private IUserService userServ;
    @Autowired
    private ITecnologyService tecnServ;
    @Autowired
    private IProjectService projServ;
    @Autowired
    private IStudyService studServ;
    @Autowired
    private ILaboralExperienceService labexpServ;

    /* ********** Identities ********** */
    // Index
    @GetMapping("/index/identities")
    @ResponseBody
    public List<Identity> listIdentity(){
        return idenServ.listIdentity();
    }

    @PostMapping("/store/identity")
    public void storeIdentity(@RequestBody Identity identity){
        idenServ.storeIdentity(identity);
    }

    // Update
    @PutMapping("/update/identity")
    public Identity updateIdentity(@RequestBody Identity iden){
        idenServ.storeIdentity(iden);
        return iden;
    }

    // Find
    @GetMapping("/find/identity/{id}")
    @ResponseBody
    public Identity findIdentity(@PathVariable Long id){
        return idenServ.findIdentity(id);
    }

    // Delete
    @DeleteMapping("/delete/identity/{id}")
    public void deleteIdentity(@PathVariable Long id){
        idenServ.deleteIdentity(id);
    }
    /* ********** End Identities ********** */




    /* ********** User ********** */
    @GetMapping("/index/users")
    @ResponseBody
    public List<User> listUser(){
        return userServ.listUser();
    }
    // Store
    @PostMapping("/store/user")
    public void storeUser(@RequestBody User user){
        userServ.storeUser(user);
    }
    // Update
    @PutMapping("/update/user")
    public User updateUser(@RequestBody User user){
        userServ.storeUser(user);
        return user;
    }
    // Find
    @GetMapping("/find/user/{id}")
    @ResponseBody
    public User findUser(@PathVariable Long id){
        return userServ.findUser(id);
    }
    // Delete
    @DeleteMapping("/delete/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userServ.deleteUser(id);
    }
    /* ********** End User ********** */

    /* ********** Tecnology ********** */
    @GetMapping("/index/tecnologies")
    @ResponseBody
    public List<Tecnology> listTecnology(){
        return tecnServ.listTecnology();
    }
    // Store
    @PostMapping("/store/tecnology")
    public void storeTecnology(@RequestBody Tecnology tec){
        tecnServ.storeTecnology(tec);
    }
    // Update
    @PutMapping("/update/tecnology")
    public Tecnology updateTecnology(@RequestBody Tecnology tec){
        tecnServ.storeTecnology(tec);
        return tec;
    }
    // Find
    @GetMapping("/find/tecnology/{id}")
    @ResponseBody
    public Tecnology findTecnology(@PathVariable Long id){
        return tecnServ.findTecnology(id);
    }
    // Delete
    @DeleteMapping("/delete/tecnology/{id}")
    public void deleteTecnology(@PathVariable Long id){
        tecnServ.deleteTecnology(id);
    }
    /* ********** End Tecnology ********** */



    /* ********** Project ********** */
    @GetMapping("/index/projects")
    @ResponseBody
    public List<Project> listProject(){
        return projServ.listProject();
    }
    // Store
    @PostMapping("/store/project")
    public void storeProject(@RequestBody Project proje){
        projServ.storeProject(proje);
    }
    // Update
    @PutMapping("/update/project")
    public Project updateProject(@RequestBody Project proje){
        projServ.storeProject(proje);
        return proje;
    }
    // Find
    @GetMapping("/find/project/{id}")
    @ResponseBody
    public Project findProject(@PathVariable Long id){
        return projServ.findProject(id);
    }
    // Delete
    @DeleteMapping("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id){
        projServ.deleteProject(id);
    }
    /* ********** End Project ********** */



    /* ********** Study ********** */
    @GetMapping("/index/studies")
    @ResponseBody
    public List<Study> listStudy(){
        return studServ.listStudy();
    }
    // Store
    @PostMapping("/store/study")
    public void storeStudy(@RequestBody Study stu){
        studServ.storeStudy(stu);
    }
    // Update
    @PutMapping("/update/study")
    public Study updateStudy(@RequestBody Study stu){
        studServ.storeStudy(stu);
        return stu;
    }
    // Find
    @GetMapping("/find/study/{id}")
    @ResponseBody
    public Study findStudy(@PathVariable Long id){
        return studServ.findStudy(id);
    }
    // Delete
    @DeleteMapping("/delete/study/{id}")
    public void deleteStudy(@PathVariable Long id){
        studServ.deleteStudy(id);
    }
    /* ********** End Study ********** */



    /* ********** LaboralExperience ********** */
    @GetMapping("/index/laboralexperiences")
    @ResponseBody
    public List<LaboralExperience> listLaboralExperience(){
        return labexpServ.listLaboralExperience();
    }
    // Store
    @PostMapping("/store/laboralexperience")
    public void storeLaboralExperience(@RequestBody LaboralExperience labex){
        labexpServ.storeLaboralExperience(labex);
    }
    // Update
    @PutMapping("/update/laboralexperience")
    public LaboralExperience updateLaboralExperience(@RequestBody LaboralExperience labex){
        labexpServ.storeLaboralExperience(labex);
        return labex;
    }
    // Find
    @GetMapping("/find/laboralexperience/{id}")
    @ResponseBody
    public LaboralExperience findLaboralExperience(@PathVariable Long id){
        return labexpServ.findLaboralExperience(id);
    }
    // Delete
    @DeleteMapping("/delete/laboralexperience/{id}")
    public void deleteLaboralExperience(@PathVariable Long id){
        labexpServ.deleteLaboralExperience(id);
    }
    /* ********** End LaboralExperience ********** */

   // Test api heroku
   @GetMapping("/time")
   @ResponseStatus(HttpStatus.OK)
   public String getCurrentTime() {

       return Instant.now().toString();
   }
}

