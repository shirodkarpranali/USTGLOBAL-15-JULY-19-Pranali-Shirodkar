import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {
  
  indianNews:any[]=[];
  constructor(private http : HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=1b13aeff82aa47bc83018d1146174232').
     subscribe(resData =>{
       this.indianNews = resData.articles;
       console.log(this.indianNews);
    })
   }
 

  ngOnInit() {
  }

}
