package com.sushant.spring.mentor_management.dto;

import lombok.Data;
@Data
public class CourseDTO {
   private   int courseId;

   private String courseName;
   private int cId;
   private int companyId;



   public CourseDTO(int courseId, String courseName, int cId, int companyId) {
      this.courseId = courseId;
      this.courseName = courseName;
      this.cId = cId;
      this.companyId = companyId;

   }

   public int getCourseId() {
      return courseId;
   }

   public void setCourseId(int courseId) {
      this.courseId = courseId;
   }

   public String getCourseName() {
      return courseName;
   }

   public void setCourseName(String courseName) {
      this.courseName = courseName;
   }

   public int getcId() {
      return cId;
   }

   public void setcId(int cId) {
      this.cId = cId;
   }

   public int getCompanyId() {
      return companyId;
   }

   public void setCompanyId(int companyId) {
      this.companyId = companyId;
   }


}
