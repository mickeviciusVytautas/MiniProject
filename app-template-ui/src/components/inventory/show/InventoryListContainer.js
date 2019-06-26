import React, { Component } from "react";
import Axios from "axios";
import ClientListComponent from "./ClientListComponent";
import api from "../../api";
class InventoryListContainer extends Component {
  constructor(){
    super();
    this.state = {
        page: 0,
      clients:[
    //   { id: '1', name: 'name for me', surname: 'Exciting surname', birthDate: 'Spectacular birthDate'},
    //   { id: '2', name: 'You for name', surname: 'Fabulous surname', birthDate: 'Amazing birthDate'},
    //   { id: '3', name: 'name for them', surname: 'Interesting surname', birthDate: 'Somber birthDate'},
    //   { id: '4', name: 'Good name', surname: 'Happy surname', birthDate: 'Famous birthDate'},
    ]
  }
  }

  componentDidMount(){
      Axios.get(api.client + "/" + this.state.page)
        .then(response => this.setState({clients: response.data}))
        .catch(error => alert(error));
  }
  render() {
    const { clients } = this.state;
    return (
      <ClientListComponent
        clients={clients}
      />
    )
  }
}
 
export default InventoryListContainer;