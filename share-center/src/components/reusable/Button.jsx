import React from 'react'
import styled, { css } from 'styled-components'
import Loader from './Loader'

const StyledButton = styled.button`
    border-radius: 5px;
    background-color: ${props => (props.secondary ? '#808f87' : '#a1cdf1')};
    color: #fff;
    padding: 10px 15px;
    font-size: ${props => {
        if (props.big) return '20px'
        return '16px'
    }};
    outline: none;
    border: none;
    cursor: pointer;
    margin: 15px auto;
    border: 2px solid ${props => (props.secondary ? '#808f87' : '#a1cdf1')};
    ${props => {
        return (
            props.inverse &&
            css`
                background-color: #fff;
                color: #a1cdf1;
            `
        )
    }};
    width: 50%;
`

const Button = ({ secondary, big, inverse, loading, children, ...props }) => {
    return (
        <StyledButton secondary={secondary} big={big} inverse={inverse} {...props}>
            {loading ? <Loader small white /> : children}
        </StyledButton>
    )
}

export default Button