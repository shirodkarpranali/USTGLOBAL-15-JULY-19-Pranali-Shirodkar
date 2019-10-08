import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.css']
})
export class HealthComponent implements OnInit {
  
  indianNews:any[]=[];
  constructor(private http : HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=health&apiKey=1b13aeff82aa47bc83018d1146174232').
     subscribe(resData =>{
       this.indianNews = resData.articles;
       console.log(this.indianNews);
    })
   }
 


  ngOnInit() {
  }

}
