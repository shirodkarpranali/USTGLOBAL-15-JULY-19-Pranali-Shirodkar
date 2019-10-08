import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
fireBaseUrl = 'https://product-a0f23.firebaseio.com/';  

  constructor(private http : HttpClient) { }

  sendData(data){
  return this.http.post(`${this.fireBaseUrl}/product.json`,data);
  }
  
  getData(){
    return this.http.get(`${this.fireBaseUrl}product.json`).pipe(map(data=>{
      let newArray:any[]=[];
      for(let key in data){  //it is used to loop inside an object
        newArray.push({...data[key],id:key});
      }
      return newArray;
    }))
  }

  updateData(key,data){
    return this.http.patch(`${this.fireBaseUrl}/product/${key}.json`,data);
  }

  deleteData(key){
    return this.http.delete(`${this.fireBaseUrl}/product/${key}.json`);
  }

}
