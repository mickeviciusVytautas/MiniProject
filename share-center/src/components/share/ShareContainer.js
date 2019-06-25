import React, { Component } from "react";
import ShareComponent from './ShareComponent';
import Axios from "axios";

class Share extends Component {

    constructor(){
        super();
        this.state = {
            title: '',
            description: '',
            comment: '' 
        }

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    
    handleChange(event) {
        this.setState({[event.target.name]: event.target.value })
    }

    handleSubmit(event) {
        event.preventDefault();
        Axios.post("http://localhost:8080/api/share", this.state)
        .then(console.log(this.state))
        .catch((error)=>{
            console.log(error);
        })
    }
    render(){
        return (
            <ShareComponent 
                onChange={this.handleChange}
                onSubmit={this.handleSubmit}            
            />
        )

    }
}

export default Share;
