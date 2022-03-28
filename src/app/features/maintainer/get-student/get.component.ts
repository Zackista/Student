import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-get',
  templateUrl: './get.component.html',
  styleUrls: ['./get.component.scss']
})
export class GetComponent implements OnInit {

  name = 'Cristóbal';
  text1= "Event Binding";
  textList:string[]  = [];
  showList: boolean = false;
  isToggle: boolean = false;
  
  studentList: any[] =[
    {
      name: "Cristóbal Olivares",
      degree:"LCC",
      status:"Promocionado"
    },
    {
      name: "Anais Gonzalez",
      degree:"TO",
      status:"Reprobado"
    },
    {
      name: "David Rodriguez",
      degree:"Abogado",
      status:"Promocionado"
    },
    {
      name: "Fabian Gutierrez",
      degree:"Ingeniero Comecial",
      status:"Regular"
    },
  ]

  constructor(){

  }

  ngOnInit(): void {
    
  }

  toggle(){
    this.isToggle = true;
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
