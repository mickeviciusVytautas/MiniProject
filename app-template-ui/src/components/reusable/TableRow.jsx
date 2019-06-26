import React, { Fragment } from 'react';
import styled from 'styled-components';
import TableData from './TableData';
import Button from './Button';
import Container from './Container';

const StyledTableRow = styled.tr`
    :nth-child(odd) {
    background-color: #eeeeee;
  };
  background-color: ${props => props.header ? '#111111 !important' : ''};
  font-family: Verdana;
  text-transform: capitalize;
  color: ${props => props.header ? '#ffffff': ''}
`

const TableRow = props => {
    const { item, header, index, onClick } = props;
    const spreadItem = 
        header ? Object.keys(item).map((key) =>  <TableData header>{key}</TableData>) 
        : Object.keys(item).map((value) =>  <TableData id={item.id}>{item[value]} </TableData>);
    return <Fragment className="justify-content"> <StyledTableRow header={header} id={item.id}>
        <TableData id={item.id} >{index !== -1 ? (index + 1) : 'Number'}</TableData>
        {spreadItem}
       </StyledTableRow>
        {header ? '' : <Button id={item.id} onClick={onClick} simple>Inventory</Button>}
        </Fragment>

}

export default TableRow;