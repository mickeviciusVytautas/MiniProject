import React, { Component } from "react";
import Axios from "axios";
import api from "../../api";
import InventoryComponent from "./InventoryComponent";

class InventoryContainer
 extends Component {

    constructor(){
        super();
        this.state = {
           
        }

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    
    handleChange(event) {
        this.setState({[event.target.name]: event.target.value })
    }

    handleSubmit(event) {
        event.preventDefault();
        const a = api.inventory + "/" + this.props.match.params.clientId;
        console.log(a)
        Axios.post(api.inventory + "/" + this.props.match.params.clientId, this.state)
        .then(alert("Succesfully updated!a"))
        .catch((error)=>{
            alert(error);
        })
    }
    
    render(){
        const a = api.inventory + "/" + this.props.match.params.clientId;
        console.log(a)
        return (
            <InventoryComponent 
                onChange={this.handleChange}
                onSubmit={this.handleSubmit}    
                type={this.state.type}
                id={this.props.match.params.clientId}        
            />
        )

    }
}

export default InventoryContainer
;
