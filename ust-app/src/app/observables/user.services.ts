import { Injectable } from "@angular/core";

@Injectable({
    providedIn : 'root'
})
export class UserService{
    users = [{
        name : 'pranali',
        company: 'UST Global'    
    },
{
    name : 'ashwini',
    company : 'UST Global'
}]

}