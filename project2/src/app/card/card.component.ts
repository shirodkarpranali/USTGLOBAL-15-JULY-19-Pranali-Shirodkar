import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
apiCard: any[] = [];

  constructor(private http: HttpClient) {
    http.get <any>('https://jsonplaceholder.typicode.com/posts')
    .subscribe(resData => {
      this.apiCard = resData;
      console.log(resData);
    });
  }

  ngOnInit() {
  }

}
