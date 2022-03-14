import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  
  name = 'Cristóbal';
  text1= "Event Binding";
  textList:string[]  = [];
  showList: boolean = false;
  
  studentList: any[] =[
    {
      name: "Cristóbal Olivares",
      degree:"LCC"
    },
    {
      name: "Anais Gonzalez",
      degree:"TO"
    },
    {
      name: "David Rodriguez",
      degree:"Abogado"
    },
  ]

  constructor(){

  }

  cambiarTexto(){
    this.text1 ="cambio de nombre";
  }

  guardarTexto(text: string){
    this.textList.push(text);
  }

  mostrarLista(){
    this.showList = true;
  }

  getName(){
    return setInterval(()=> 
      this.name = "Belén", 3000
    );
  }

}
