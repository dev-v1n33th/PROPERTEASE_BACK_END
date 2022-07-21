import React from 'react'
import Guestdetails from './DOMguestdetails/guestdetails'
import RegGuestDetails from './RegGuestdetails'

function GuestDetailsIndex(props) {
    var occtype = props.guestdetails.occupancyType
    console.log("hey this is guest details index")
    console.log(props.TotalAmountByGuest)
  return (
    <div>{occtype == 'Regular' ? (<RegGuestDetails TotalAmountByGuest={props.TotalAmountByGuest} guestdetails={props.guestdetails} GuestDueAmount={props.GuestDueAmount}/>) : (<Guestdetails TotalAmountByGuest={props.TotalAmountByGuest} guestdetails={props.guestdetails} GuestDueAmount={props.GuestDueAmount} />)}</div>
  )
}

export default GuestDetailsIndex