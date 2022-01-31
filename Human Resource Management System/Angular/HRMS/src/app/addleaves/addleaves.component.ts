import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HrmsService } from '../hrms.service';
import { Leaves } from '../leaves';

@Component({
  selector: 'app-addleaves',
  templateUrl: './addleaves.component.html',
  styleUrls: ['./addleaves.component.css']
})
export class AddleavesComponent implements OnInit {

  leaves=new Leaves();
  msg="";
  constructor(private service: HrmsService,private router:Router) { }

  ngOnInit(): void {
  }

  addLeaves()
  {
    this.service.addLeavesFromRemote(this.leaves).subscribe(
      data => {
        console.log("Salary Added Successfully ");
        this.msg="Employee Leaves Added Successfully"
      },
      error => {
        console.log("exception occured");
        this.msg="Something Went Wrong"

      }
    )
  }
}