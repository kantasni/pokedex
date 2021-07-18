import React, { useEffect, useState } from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActionArea from '@material-ui/core/CardActionArea';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';
import pokicon from './pokeball.png'
import Grid from '@material-ui/core/Grid';
import axios from 'axios';
const useStyles = makeStyles({
    
    big: {
     
      marginTop:'70px',
      direction:'row',
      width:'100%',
    },
    root: {
      maxWidth:200,
      backgroundColor:'#fd7d7f',
      marginLeft:'50px',
      width:'100%'
     
    },
    media: {
      
      height: '170px',
      resizeMode: 'contain',
      
    },
  });

function WildPokemons(props) {
    const [flag, setFlag] = useState(false)
    const [wilds, setWilds] = useState(null)
    
    useEffect(() => {
      
      fetch('uncaught',{method: 'GET',
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
         }, mode: 'cors'}).then(res=> res.json()).then(json => {
            setWilds(json)
          })
        
        
       
      },[flag]);

    const piake =(onoma)=>{
      let success= false
      fetch('catch',{method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }, mode: 'cors',body:JSON.stringify({name:onoma})}).then(res=> res.json()).then(json => {
        success=json.result
      }).then(
        success?setFlag(!flag):console.log("rikse pale")
      )

    }
    const display=()=>{
      if(wilds!=null){
        return(
          wilds.map((pokemon,index)=>(
              
            <Card className={classes.root}>
              {console.log(pokemon)}
              <CardMedia 
                className={classes.media}
                image={pokicon}
                title="Catch"
                onClick={()=>{console.log('catch')}}
              />
              <CardContent>
                <Typography gutterBottom variant="h5" component="h2">
                  Name:{pokemon.name} Type:{pokemon.type}
                </Typography>
                <Typography gutterBottom variant="h5" component="h2">Moves</Typography>
                {pokemon.moves.map((move)=>(
                  <Typography variant="body2" color="textSecondary" component="p">
                    Name:{move.name} Type:{move.type}
                  </Typography>
                ))}
                
              </CardContent>
            
            
          </Card>
          ))
        )
      }
      else
        return
    }
  

    
      const classes = useStyles();
    return (
      
    <Grid container className={classes.big} spacing={0}>
      <Grid item lg={36}>
        <Grid container  spacing={2}>
            {display()}
        </Grid>
      </Grid>
    </Grid>
      
  );
}

export default WildPokemons;