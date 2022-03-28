import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CoreComponent } from './core.component';
import { InicioModule } from '../features/inicio.module';




@NgModule({
  declarations: [CoreComponent],
  imports: [
    CommonModule,
    InicioModule
  ],
  exports: [
    CoreComponent
  ]
})
export class CoreModule { }
