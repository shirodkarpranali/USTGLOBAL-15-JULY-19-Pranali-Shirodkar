import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {
apiTable: any[] = [];
  constructor(private http: HttpClient) {
    http.get <any>('https://api.github.com/users').subscribe(resData => {
      this.apiTable = resData;
      console.log(resData);
    });
   }

  ngOnInit() {
  }

}
