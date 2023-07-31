import { Component, OnInit } from '@angular/core';
import {Survey} from '../survey'

@Component({
  selector: 'app-survey-list',
  templateUrl: './survey-list.component.html',
  styleUrls: ['./survey-list.component.css']
})
export class SurveyListComponent implements OnInit{

  surveys: Survey[];
  constructor() {}
  ngOnInit(): void{
    this.surveys =  [{
            "sid": 1,
            "fname":"nehanth",
            "lname":"P",
            "address":"fairfax va",
            "city":"fairfax",
            "state":"virginia",
            "zip": "22030",
            "phone":"111111111",
            "email":"nehanth@gmail.com",
            "date":"31-07-2023",
            "liking":"location",
            "interest":"friends",
            "likelyhood":"very likely",
            "comments":"NA"
    },
    {
      "sid": 2,
      "fname":"nehanth2",
      "lname":"P",
      "address":"fairfax va",
      "city":"fairfax",
      "state":"virginia",
      "zip": "22030",
      "phone":"1111111112",
      "email":"nehanth@gmail.com",
      "date":"31-07-2023",
      "liking":"location",
      "interest":"friends",
      "likelyhood":"very likely",
      "comments":"NA"
} ];
  }



}
