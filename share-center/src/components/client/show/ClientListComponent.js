import React from 'react';
import TableRow from '../../reusable/TableRow';
import Container from '../../reusable/Container';
import Heading from '../../reusable/Heading';
import Table from '../../reusable/Table';


const ClientListComponent = props => {
    const { clients } = props;
    const listOfItems = clients ?  clients.map((client, key) => 
    <TableRow item={client} key={key}/>
    ) : '';
    return <Container>
    <Heading h3>Client list</Heading>
    <Table>
      <TableRow header item={clients ? clients[0] != undefined ? clients[0] : '' : ''}/>
      {listOfItems}
    </Table>
  </Container>
}

export default ClientListComponent;