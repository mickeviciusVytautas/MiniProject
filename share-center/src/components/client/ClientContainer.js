import React, { Component } from "react";
import ClientComponent from './ClientComponent';
import Axios from "axios";
import api from "../api";

class Client extends Component {

    constructor(){
        super();
        this.state = {
            name: '',
            surname: '',
            birthDate: '',
            type: 'ORDINARY',
        }

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    
    handleChange(event) {
        this.setState({[event.target.name]: event.target.value })
        console.log(event.target.value);
    }

    handleSubmit(event) {
        event.preventDefault();
        Axios.post(api.client, this.state)
        .then(console.log(this.state))
        .catch((error)=>{
            console.log(error);
        })
    }
    render(){
        return (
            <ClientComponent 
                onChange={this.handleChange}
                onSubmit={this.handleSubmit}    
                type={this.state.type}        
            />
        )

    }
}

export default Client;
