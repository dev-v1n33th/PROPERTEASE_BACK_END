import React from 'react'
import { Image, Row, Col,Container } from 'react-bootstrap';
import { useEffect } from 'react';
import axios from '../../../../../Uri'
import { Grid ,Avatar} from '@mui/material';
import {pic}  from './GuestPic.css';
import Button from '@mui/material/Button';

function GuestPic(props) {
    console.log(props.GuestPic)
    const [guestPicUrl, setGuestPicUrl] = React.useState({});
    // console.log(props.guestdetails.id);

    useEffect(async () => {
        await axios

            .get(`/guest/files/${props.guestdetails.id}`)
            .then((res) => {
                setGuestPicUrl(res.data)
                console.log(res.data)
            })
            .catch((err) => {
                console.log(err)

            });
    }, [props.guestdetails.id]);
    
    return (
       
       <Grid container>
           <Grid item xs={12}>
            <Image className='pic' alt={`${props.guestdetails.firstName} ${props.guestdetails.lastName}`} src={`data:image/jpeg;base64,${guestPicUrl.data}`} height={230} width={200}/>
            </Grid>
            <Button variant="contained" component="label">
  Upload
  <input hidden accept="image/*" multiple type="file" />
</Button>
            </Grid>
        
       
       )
}

export default GuestPic