import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{ FormsModule} from '@angular/forms';


import { AppComponent } from './app.component';
import { SamCompo } from './sample.component';
import { HeaderComponent } from './header/header.component';
import { DatabindingComponent } from './databinding/databinding.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { DirectivesComponent } from './directives/directives.component';
import { SwitchComponent } from './switch/switch.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { MyDirectiveDirective } from './my-directive.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';


@NgModule({
  declarations: [
    AppComponent ,
    SamCompo,
    HeaderComponent,
    DatabindingComponent,
    TwoWayComponent,
    DirectivesComponent,
    SwitchComponent,
    AttributeDirectivesComponent,
    MyDirectiveDirective,
    ParentComponent,
    ChildComponent,
    BikesComponent,
    BikeDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
