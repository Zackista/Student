import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InicioComponent } from './inicio.component';
import { MaintainerModule } from './maintainer/maintainer.module';



@NgModule({
  declarations: [InicioComponent],
  imports: [
    CommonModule,
    MaintainerModule
  ],
  exports:[InicioComponent]
})
export class InicioModule { }
