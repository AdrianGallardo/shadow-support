/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadow_support;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AGALLARD
 */
public class Ticket {
  private String sTicketid;
  private String sProblemreported;
  private String sCategory;
  private String sPreviousassigmentgroup;
  private String sTypeofsolution;
  private String sStepstosolveit;
  private String sAveragehrstosolveit;
  private String sScriptusedforsolution;
  private String sSolutionartifactshared;
  private String sOthersupportteams;
  private String sResourcescontacted;
  private String sEscalationrequired;
  private String sEscalationprocess;
  private String sChangerequestneeded;
  private Date dSolveddate;
  private Date dReporteddate;
  private String sSolvedby;
  
  public Ticket(String sTicketid,
                String sProblemreported,
                String sCategory,
                String sPreviousassigmentgroup,
                String sTypeofsolution,
                String sStepstosolveit,
                String sAveragehrstosolveit,
                String sScriptusedforsolution,
                String sSolutionartifactshared,
                String sOthersupportteams,
                String sResourcescontacted,
                String sEscalationrequired,
                String sEscalationprocess,
                String sChangerequestneeded,
                Date dSolveddate,
                Date dReporteddate,
                String sSolvedby,
                boolean bIsNew,
                boolean bIsUpdated,
                boolean bIsDeleted){
    this.sTicketid = sTicketid;
    this.sProblemreported = sProblemreported;
    this.sCategory = sCategory;
    this.sPreviousassigmentgroup = sPreviousassigmentgroup;
    this.sTypeofsolution = sTypeofsolution;
    this.sStepstosolveit = sStepstosolveit;
    this.sAveragehrstosolveit = sAveragehrstosolveit;
    this.sScriptusedforsolution = sScriptusedforsolution;
    this.sSolutionartifactshared = sSolutionartifactshared;
    this.sOthersupportteams = sOthersupportteams;
    this.sResourcescontacted = sResourcescontacted;
    this.sEscalationrequired = sEscalationrequired;
    this.sEscalationprocess = sEscalationprocess;
    this.sChangerequestneeded = sChangerequestneeded;
    this.dSolveddate = dSolveddate;
    this.dSolveddate = dSolveddate;
    this.sSolvedby = sSolvedby;
  }
  
  public String getTicketid(){
    return this.sTicketid;
  }
  public String getProblemreported(){
    return this.sProblemreported;
  }
  public String getCategory(){
    return this.sCategory;
  }
  public String getPreviousassigmentgroup(){
    return this.sPreviousassigmentgroup;
  }
  public String getTypeofsolution(){
    return this.sTypeofsolution;
  }
  public String getStepstosolveit(){
    return this.sStepstosolveit;
  }
  public String getAveragehrstosolveit(){
    return this.sAveragehrstosolveit;
  }
  public String getScriptusedforsolution(){
    return this.sScriptusedforsolution;
  }
  public String getSolutionartifactshared(){
    return this.sSolutionartifactshared;
  }
  public String getOthersupportteams(){
    return this.sOthersupportteams;
  }
  public String getResourcescontacted(){
    return this.sResourcescontacted;
  }
  public String getEscalationrequired(){
    return this.sEscalationrequired;
  }
  public String getEscalationprocess(){
    return this.sEscalationprocess;
  }
  public String getChangerequestneeded(){
    return this.sChangerequestneeded;
  }
  public Date getSolveddate(){
    return this.dSolveddate;
  }
  public String getSolveddateText() {
    String dateString = "";
    SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
   
    try{
	    dateString = sdfr.format(getSolveddate());
    }catch (Exception ex ){
	    System.out.println(ex);
    }
    return dateString;
  }
  public Date getReporteddate(){
    return this.dReporteddate;
  }
  public String getReporteddateText() {
    String dateString = "";
    SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
   
    try{
	    dateString = sdfr.format(getReporteddate());
    }catch (Exception ex ){
	    System.out.println(ex);
    }
    return dateString;
  }
  public String getSolvedby(){
    return this.sSolvedby;
  }
  public void setTicketid(String sTicketid){
    this.sTicketid = sTicketid;  
  }
  public void setProblemreported(String sProblemreported){
    this.sProblemreported = sProblemreported;  
  }
  public void setCategory(String sCategory){
    this.sCategory = sCategory;
  }
  public void setPreviousassigmentgroup(String sPreviousassigmentgroup){
    this.sPreviousassigmentgroup = sPreviousassigmentgroup;  
  }
  public void setTypeofsolution(String sTypeofsolution){
    this.sTypeofsolution = sTypeofsolution;  
  }
  public void setStepstosolveit(String sStepstosolveit){
    this.sStepstosolveit = sStepstosolveit;  
  }
  public void setAveragehrstosolveit(String sAveragehrstosolveit){
    this.sAveragehrstosolveit = sAveragehrstosolveit;  
  }
  public void setScriptusedforsolution(String sScriptusedforsolution){
    this.sScriptusedforsolution = sScriptusedforsolution;  
  }
  public void setSolutionartifactshared(String sSolutionartifactshared){
    this.sSolutionartifactshared = sSolutionartifactshared;  
  }  
  public void setOthersupportteams(String sOthersupportteams){
    this.sOthersupportteams = sOthersupportteams;  
  }
  public void setResourcescontacted(String sResourcescontacted){
    this.sResourcescontacted = sResourcescontacted;  
  }
  public void setEscalationrequired(String sEscalationrequired){
    this.sEscalationrequired = sEscalationrequired;  
  }
  public void setEscalationprocess(String sEscalationprocess){
    this.sEscalationprocess = sEscalationprocess;  
  }
  public void setChangerequestneeded(String sChangerequestneeded){
    this.sChangerequestneeded = sChangerequestneeded;  
  }
  public void setSolveddate(Date dSolveddate){
    this.dSolveddate = dSolveddate;  
  }
  public void setReporteddate(Date dReporteddate){
    this.dReporteddate = dReporteddate;  
  }
  public void setSolvedby(String sSolvedby){
    this.sSolvedby = sSolvedby;  
  } 
}
