
import { AppBar,Grid,Typography } from '@material-ui/core';
import Toolbar from '@material-ui/core/Toolbar';
import Container from 'react-bootstrap/Container'
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'
import { Route,BrowserRouter as Router,Link, Switch } from 'react-router-dom';
import './App.css';
import WildPokemons from './mainScreen/WildPokemons';
import MyPokemons from './MyPokemons';

function App() {
  return (
    <Router>
      

        <AppBar>

          <Container>
            <Row md={4} >
              <Col align='start'>
                <Link to='/'>
                  <Typography variant="h6" >
                    Pokedex
                  </Typography>
                </Link>
              </Col>
              <Col>
                <Link  to='/MyPokemons'>
                  <Typography variant="h6" >
                    MyPokemons
                  </Typography>
                </Link>
              </Col>
              
            </Row>
          </Container>
          
        </AppBar>
        <Switch>
          <Route path='/MyPokemons' component={MyPokemons}/>
          <Route path='/' exa component={WildPokemons}/>
        </Switch>
        
         
        
      
    </Router>
    
  );
}

export default App;
