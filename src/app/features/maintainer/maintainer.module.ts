import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaintainerComponent } from './maintainer.component';
import { GetComponent } from './get-student/get.component';
import { CreateStudentComponent } from './create-student/create-student.component';
import { UpdateStudentComponent } from './update-student/update-student.component';



@NgModule({
  declarations: [
    MaintainerComponent,
    GetComponent,
    CreateStudentComponent,
    UpdateStudentComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[MaintainerComponent]
})
export class MaintainerModule { }
