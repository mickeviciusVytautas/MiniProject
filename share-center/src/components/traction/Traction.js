import React, { Component } from "react";
import Heading from "../reusable/Heading";
import TableRow from "../reusable/TableRow";
import Table from "../reusable/Table";
import Container from "../reusable/Container";
class Traction extends Component {
  constructor(){
    super();
    this.state = {
      items:[
      { id: '1', title: 'Title for me', description: 'Exciting description', comment: 'Spectacular comment'},
      { id: '2', title: 'You for title', description: 'Fabulous description', comment: 'Amazing comment'},
      { id: '3', title: 'Title for them', description: 'Interesting description', comment: 'Somber comment'},
      { id: '4', title: 'Good title', description: 'Happy description', comment: 'Famous comment'},
    ]
  }
  }

  render() {
    const listOfItems = this.state.items.map((item, key) => 
      <TableRow item={item} key={key}/>
      )
    return (
      <Container>
        <Heading h3>Your traction</Heading>
        <Table>
          <TableRow header item={this.state.items[0]}/>
          {listOfItems}
        </Table>
      </Container>
    )
  }
}
 
export default Traction;