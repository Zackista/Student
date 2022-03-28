import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-maintainer',
  templateUrl: './maintainer.component.html',
  styleUrls: ['./maintainer.component.scss']
})
export class MaintainerComponent {

  isGet: boolean = false;

  showGet(){
    console.log('estoy entrandoooo');
    this.isGet = true;
  }

}
