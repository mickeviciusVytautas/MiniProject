import React, { Component } from "react";
import Axios from "axios";
import api from "../../api";
import InventoryComponent from "./InventoryComponent";

class InventoryContainer
 extends Component {

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
        console.log(this.props.match.params)
    }

    handleSubmit(event) {
        event.preventDefault();
        Axios.post(api.client, this.state)
        .then(alert("Succesfully updated!"))
        .catch((error)=>{
            alert(error);
        })
    }
    render(){
        return (
            <InventoryComponent 
                onChange={this.handleChange}
                onSubmit={this.handleSubmit}    
                type={this.state.type}        
            />
        )

    }
}

export default InventoryContainer
;
