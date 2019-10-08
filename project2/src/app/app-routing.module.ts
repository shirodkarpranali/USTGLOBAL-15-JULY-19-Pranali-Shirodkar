import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TableComponent } from './table/table.component';
import { CardComponent } from './card/card.component';


const routes: Routes = [
  {path: '' , component : TableComponent},
  {path: 'card' , component : CardComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
