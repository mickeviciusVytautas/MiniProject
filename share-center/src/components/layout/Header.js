import React from 'react';
import { NavLink } from 'react-router-dom';
import List from '../reusable/List';
import ListItem from '../reusable/ListItem';
import Heading from '../reusable/Heading';

const Header = (props) => {
    return <header>
        <Heading h3>Trophy</Heading>
        <List inline dark class="router" role="navigation">
            <ListItem><NavLink exact to="/">Home</NavLink></ListItem>
            <ListItem><NavLink to="/traction">Traction</NavLink></ListItem>
            <ListItem special center><NavLink  to="/share"><i class="far fa-share-square"></i></NavLink></ListItem>
            <ListItem><NavLink to="/groups">Groups</NavLink></ListItem>
            <ListItem><NavLink>Profile</NavLink></ListItem>
        </List>
    </header>
}

export default Header;