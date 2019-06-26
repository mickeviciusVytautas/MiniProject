import React, { Component } from "react";
import styled from 'styled-components'

const StyledList = styled.ul`
    display: ${props => props.inline ? 'inline-flex' : ''};
    background-color: ${props => props.dark ? '#322F41' : '#fff'};
    padding: 0;
    justify-content: center;
    width: 100%;
    list-style: none;
`
class List extends Component {
    render() {
        const { dark, inline, ...props } = this.props;
        return(
            <StyledList 
                inline={inline}
                dark = {dark}
                {...props}
            />
        )
    }
}

export default List;